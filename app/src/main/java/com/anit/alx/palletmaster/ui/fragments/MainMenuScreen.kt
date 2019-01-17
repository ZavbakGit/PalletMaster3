package com.anit.alx.palletmaster.ui.fragments

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.AdapterView
import com.anit.alx.palletmaster.R
import com.anit.alx.palletmaster.mvp.presenters.MainMenuPresenter
import com.anit.alx.palletmaster.mvp.view.MainMenuView
import com.anit.alx.palletmaster.ui.adapters.ListMenuAdapter
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.campus.android.app.interfaces.RouterProvider
import kotlinx.android.synthetic.main.main_menu_screen.*

class MainMenuScreen : BaseScreen(), MainMenuView {


    @InjectPresenter
    lateinit var presenter: MainMenuPresenter

    @ProvidePresenter
    fun provideMainPresenter(): MainMenuPresenter {
        return MainMenuPresenter((activity as RouterProvider).getRouter())
    }

    companion object {
        private val ARG_CAUGHT = "MainMenuScreen"

        fun newInstance(): MainMenuScreen {
            val args: Bundle = Bundle()
            args.putSerializable(ARG_CAUGHT, null)
            val fragment = MainMenuScreen()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onStart() {
        super.onStart()
        presenter.onStart()
    }


    override fun getRouter() = (activity as RouterProvider).getRouter()
    override fun getLayout() = R.layout.main_menu_screen
    override fun onBackPressed() = presenter.onBackPressed()

    override fun refresh() {
        lv_menu_screen_list.adapter =
                ListMenuAdapter(activity, presenter.getListMenu())

        lv_menu_screen_list.requestFocus(0)
        lv_menu_screen_list.setSelection(0)
        lv_menu_screen_list.setClickable(true)


        lv_menu_screen_list.onItemClickListener =
                AdapterView.OnItemClickListener { parent, view, position, id ->
                    presenter.clickItemMenu(
                        position
                    )
                }

        lv_menu_screen_list.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View, keyCode: Int, event: KeyEvent): Boolean {

                if (event.action == KeyEvent.ACTION_DOWN) {
                    presenter.pressKey(event.number)
                }
                return false
            }
        })
    }
}