package com.taobao.luaview.userdata.constants;

import com.taobao.luaview.userdata.base.BaseLuaTable;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/**
 * View特效
 *
 * @author song
 * @date 16/8/15
 * 主要功能描述
 * 修改描述
 * 下午4:01 song XXX
 */
public class UDViewEffect extends BaseLuaTable {
    public static final int EFFECT_NONE = -1;
    public static final int EFFECT_CLICK = 1;
    public static final int EFFECT_PARALLAX = 2;

    public UDViewEffect(Globals globals, LuaValue metatable) {
        super(globals, metatable);
        init();
    }

    private void init() {
        initEffects();
    }


    /**
     * View的特效
     */
    private void initEffects() {
        set("NONE", EFFECT_NONE);//无效果
        set("CLICK", EFFECT_CLICK);//点击
        set("PARALLAX", EFFECT_PARALLAX);//视差效果
    }

}