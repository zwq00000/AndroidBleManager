package com.blakequ.bluetooth_manager_lib.connect.multiple;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.content.Context;

import java.util.List;

/**
 * Copyright (C) BlakeQu All Rights Reserved <blakequ@gmail.com>
 * <p/>
 * Licensed under the blakequ.com License, Version 1.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * author  : quhao <blakequ@gmail.com> <br>
 * date     : 2016/8/19 9:49 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:manager multiple bluetooth device connect
 */
@TargetApi(18)
public final class MultiConnectManager extends ConnectRequestQueue {

    private static long reconnectTime = 4000; //断开后等待尝试重新连接的时间
    private static int reconnectedNum = 2; //断开后重新连接的次数（不会立即重连--考虑到可能是切换连接设备）

    public MultiConnectManager(Context context, int maxLen) {
        super(context, maxLen);
    }


    public void setServiceUUID(String serviceUUID) {

    }



    public List<BluetoothDevice> getConnectedDevice() {
        return null;
    }

}