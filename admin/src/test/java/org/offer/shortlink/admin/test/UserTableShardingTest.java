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

    public static final String SQL = "create table `t_group_%d`\n" +
            "(\n" +
            "    `id`          bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "    `gid`         varchar(32)  DEFAULT NULL COMMENT '分组标识',\n" +
            "    `name`        varchar(64)  DEFAULT NULL COMMENT '分组名称',\n" +
            "    `username`    varchar(256) DEFAULT NULL COMMENT '创建分组用户名',\n" +
            "    `sort_order`  int(3)        DEFAULT NULL COMMENT '分组排序',\n" +
            "    `create_time` datetime    DEFAULT NULL COMMENT '创建时间',\n" +
            "    `update_time` datetime    DEFAULT NULL COMMENT '修改时间',\n" +
            "    `del_flag`    tinyint(1)   DEFAULT NULL COMMENT '删除标识 0：未删除 1：已删除',\n" +
            "    PRIMARY KEY (`id`),\n" +
            "    UNIQUE KEY `idx_unique_username_gid` (gid, username) USING BTREE\n" +
            ")ENGINE=InnoDB AUTO_INCREMENT=1716734146606301186 DEFAULT CHARSET=utf8mb4;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
