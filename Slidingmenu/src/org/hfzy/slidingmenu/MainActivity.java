package org.hfzy.slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

	private SlidingMenu menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		menu = new SlidingMenu(this);
		 //设置菜单模式，LEFT(仅左侧边栏) RIGHT(仅右侧边栏) 
		//LEFT_RIGHT(左右侧边栏)
        menu.setMode(SlidingMenu.LEFT_RIGHT);
        //滑动模式
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		 //设置偏离距离
		menu.setBehindOffset(200);
		menu.setFadeDegree(0.5f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		//设置两个左右布局文件
		menu.setMenu(R.layout.left_layout);
		menu.setSecondaryMenu(R.layout.right_layout);
		ImageButton ibMenu = (ImageButton) findViewById(R.id.ib_menu);
		//点击事件
		ibMenu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//左边侧栏
				//menu.toggle();
				//显示右边的侧栏
				menu.showSecondaryMenu();
			}
		});
		
	}


}
