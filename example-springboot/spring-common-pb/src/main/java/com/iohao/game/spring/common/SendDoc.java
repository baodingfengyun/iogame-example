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
package com.iohao.game.spring.common;

import com.iohao.game.action.skeleton.annotation.DocActionSend;
import com.iohao.game.action.skeleton.annotation.DocActionSends;
import com.iohao.game.spring.common.cmd.SchoolCmdModule;
import com.iohao.game.spring.common.pb.SpringBroadcastMessagePb;

/**
 * 广播（推送）文档生成标记
 *
 * @author 渔民小镇
 * @date 2022-07-10
 */
@DocActionSends({
        @DocActionSend(cmd = SchoolCmdModule.cmd,
                subCmd = SchoolCmdModule.broadcastData,
                dataClass = SpringBroadcastMessagePb.class),
})
public class SendDoc {
}
