package com.elderdrivers.riru.xposed.entry.bootstrap;

import com.elderdrivers.riru.common.KeepMembers;
import com.elderdrivers.riru.xposed.entry.hooker.HandleBindAppHooker;
import com.elderdrivers.riru.xposed.entry.hooker.InstrumentationHooker;
import com.elderdrivers.riru.xposed.entry.hooker.LoadedApkConstructorHooker;
import com.elderdrivers.riru.xposed.entry.hooker.MakeAppHooker;
import com.elderdrivers.riru.xposed.entry.hooker.SystemMainHooker;

public class SysBootstrapHookInfo implements KeepMembers {
    public static String[] hookItemNames = {
//            InstrumentationHooker.CallAppOnCreate.class.getName(),
            HandleBindAppHooker.class.getName(),
            MakeAppHooker.class.getName(),
            SystemMainHooker.class.getName(),
            LoadedApkConstructorHooker.class.getName()
    };
}
