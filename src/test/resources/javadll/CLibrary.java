package com.javadll;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CLibrary extends Library {
    CLibrary INSTANCE = (CLibrary) Native.loadLibrary("BY618DLL", CLibrary.class);
    // 初始化通讯端口
    int SNBC_InitComm(int iComm);
}
