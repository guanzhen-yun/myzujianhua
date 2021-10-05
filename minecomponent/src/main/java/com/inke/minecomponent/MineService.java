package com.inke.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.inke.componentlib.IMineService;

public class MineService implements IMineService {
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }
}
