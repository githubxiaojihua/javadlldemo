package com.javadll;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * 测试身份证读卡器dll的调用
 */
public interface CLibrary extends Library {
    CLibrary INSTANCE = (CLibrary) Native.loadLibrary("dll/BY618DLL", CLibrary.class);
    // 初始化通讯端口
    int SNBC_InitComm(int iComm);
    // 读卡
    int SNBC_ReadContent();
    // 卡复位
    int SNBC_ResetSAM();
}
