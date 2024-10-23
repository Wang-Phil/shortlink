/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.offer.shortlink.admin.test;
public class UserTableShardingTest {

    public static final String SQL = "ALTER TABLE t_link_%d ADD COLUMN total_uv INT DEFAULT 0 COMMENT '历史uv' after `describe` , \n" +
            "ADD COLUMN total_pv INT DEFAULT 0 COMMENT '历史pv' after total_uv , \n" +
            "ADD COLUMN total_uip INT DEFAULT 0 COMMENT '历史uip' after total_pv;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
