package com.yugioh.android.fragments;

import android.os.Bundle;
import android.view.Menu;

import com.rarnu.devlib.base.BaseFragment;
import com.yugioh.android.R;

public class DuelToolFragment extends BaseFragment {

	public DuelToolFragment(String tagText, String tabTitle) {
		super(tagText, tabTitle);
	}
	
	@Override
	protected int getBarTitle() {
		return R.string.lm_tool;
	}

	@Override
	protected int getBarTitleWithPath() {
		return R.string.lm_tool;
	}

	@Override
	protected String getCustomTitle() {
		return null;
	}

	@Override
	protected int getFragmentLayoutResId() {
		return R.layout.fragment_tool;
	}

	@Override
	protected String getMainActivityName() {
		return "";
	}

	@Override
	protected void initComponents() {


	}

	@Override
	protected void initEvents() {

	}

	@Override
	protected void initLogic() {

	}

	@Override
	protected void initMenu(Menu arg0) {

	}

	@Override
	protected void onGetNewArguments(Bundle arg0) {

	}
	
	@Override
	public void onPause() {
		// TODO: backup data
		super.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		// TODO: restore data
	}

}
