/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2022 double joker （262610965@qq.com） . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iohao.game.spring.common.cmd;

/**
 * @author 渔民小镇
 * @date 2022-08-26
 */
public interface OtherSchoolCmdModule {
    int cmd = SpringCmdModule.otherSchoolCmd;

    int jsr380 = 1;

    /** 业务参数自动装箱、拆箱基础类型 long */
    int longPbWrapper = 2;
    int longPbWrapperLonger = 3;
    int longPbWrapperLongPb = 4;

    /** 业务参数自动装箱、拆箱基础类型 int */
    int intPbWrapper = 5;

    int longPbWithBroadcast = 6;

    int longPbWithBroadcastData = 7;


}
