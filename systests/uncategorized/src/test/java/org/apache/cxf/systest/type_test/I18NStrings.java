/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.systest.type_test;

public final class I18NStrings {

    public static final String JAP_SIMPLE_STRING;
    public static final String CHINESE_COMPLEX_STRING;

    static {
        String tmp;
        try {
            // GoogleSearchPreferences with Search and Preferences in japanese :)
            tmp =  new String(new byte[] {
                (byte)0xfe, (byte)0xff, (byte)0x0, (byte)0x47, (byte)0x0, (byte)0x6f,
                (byte)0x0, (byte)0x6f, (byte)0x0, (byte)0x67, (byte)0x0, (byte)0x6c,
                (byte)0x0, (byte)0x65, (byte)0x69, (byte)0x1c, (byte)0x7d, (byte)0x22,
                (byte)0x69, (byte)0x1c, (byte)0x7d, (byte)0x22, (byte)0x30, (byte)0xaa,
                (byte)0x30, (byte)0xd7, (byte)0x30, (byte)0xb7, (byte)0x30, (byte)0xe7,
                (byte)0x30, (byte)0xf3, }, "utf-16");
        } catch (Exception ex) {
            tmp = null;
        }
        JAP_SIMPLE_STRING = tmp;

        try {
            tmp = new String(new byte[] {
                (byte)0xfe, (byte)0xff, (byte)0xff, (byte)0x4f, (byte)0xff, (byte)0x50,
                (byte)0xff, (byte)0x51, (byte)0xff, (byte)0x52, (byte)0xff, (byte)0x53,
                (byte)0xff, (byte)0x54, (byte)0xff, (byte)0x55, (byte)0xff, (byte)0x56,
                (byte)0xff, (byte)0x57, (byte)0xff, (byte)0x58, (byte)0xff, (byte)0x59,
                (byte)0xff, (byte)0x5a, (byte)0x0, (byte)0xa, (byte)0xff, (byte)0x21,
                (byte)0xff, (byte)0x22, (byte)0xff, (byte)0x23, (byte)0xff, (byte)0x24,
                (byte)0xff, (byte)0x25, (byte)0xff, (byte)0x26, (byte)0xff, (byte)0x27,
                (byte)0xff, (byte)0x28, (byte)0xff, (byte)0x29, (byte)0xff, (byte)0x2a,
                (byte)0xff, (byte)0x2b, (byte)0xff, (byte)0x2c, (byte)0xff, (byte)0x2d,
                (byte)0xff, (byte)0x2e, (byte)0x0, (byte)0xa, (byte)0xff, (byte)0x2f,
                (byte)0xff, (byte)0x30, (byte)0xff, (byte)0x31, (byte)0xff, (byte)0x32,
                (byte)0xff, (byte)0x33, (byte)0xff, (byte)0x34, (byte)0xff, (byte)0x35,
                (byte)0xff, (byte)0x36, (byte)0xff, (byte)0x37, (byte)0xff, (byte)0x38,
                (byte)0xff, (byte)0x39, (byte)0xff, (byte)0x3a, (byte)0x0, (byte)0xa,
                (byte)0xff, (byte)0x1, (byte)0x0, (byte)0xb7, (byte)0xff, (byte)0x3,
                (byte)0xff, (byte)0xe5, (byte)0xff, (byte)0x5, (byte)0x20, (byte)0x26,
                (byte)0x20, (byte)0x26, (byte)0x20, (byte)0x14, (byte)0xff, (byte)0xa,
                (byte)0x20, (byte)0x26, (byte)0xff, (byte)0x8, (byte)0xff, (byte)0x9,
                (byte)0x30, (byte)0x0, (byte)0xff, (byte)0x3b, (byte)0xff, (byte)0x3d,
                (byte)0xff, (byte)0x5b, (byte)0xff, (byte)0x5d, (byte)0xff, (byte)0xb,
                (byte)0xff, (byte)0xd, (byte)0xff, (byte)0x1d, (byte)0x20, (byte)0x14,
                (byte)0xff, (byte)0x1b, (byte)0xff, (byte)0x1a, (byte)0x20, (byte)0x18,
                (byte)0x20, (byte)0x19, (byte)0x20, (byte)0x1c, (byte)0x20, (byte)0x1d,
                (byte)0x30, (byte)0x1, (byte)0x30, (byte)0xa, (byte)0x30, (byte)0xb,
                (byte)0xff, (byte)0xc, (byte)0x30, (byte)0x2, (byte)0xff, (byte)0x1f,
                (byte)0xff, (byte)0xf, (byte)0x0, (byte)0xa, (byte)0x59, (byte)0x82,
                (byte)0x68, (byte)0xa6, (byte)0x4e, (byte)0xe4, (byte)0x30, (byte)0x0,
                (byte)0x5f, (byte)0x97, (byte)0x5e, (byte)0xa6, (byte)0x0, (byte)0xa,
                (byte)0x84, (byte)0x3d, (byte)0x51, (byte)0x65, (byte)0x51, (byte)0xe1,
                (byte)0x95, (byte)0xf4, (byte)0x6d, (byte)0xf1, (byte)0x59, (byte)0x4,
                (byte)0xff, (byte)0xc, (byte)0x0, (byte)0xa, (byte)0x8f, (byte)0xf7,
                (byte)0x59, (byte)0x31, (byte)0x4e, (byte)0xd, (byte)0x77, (byte)0xe5,
                (byte)0x5f, (byte)0x52, (byte)0x8d, (byte)0xef, (byte)0x30, (byte)0x2,
                (byte)0x0, (byte)0xa, (byte)0x8f, (byte)0x97, (byte)0x8f, (byte)0x6c,
                (byte)0x53, (byte)0x43, (byte)0x76, (byte)0x7e, (byte)0x5e, (byte)0x74,
                (byte)0xff, (byte)0xc, (byte)0x0, (byte)0xa, (byte)0x5e, (byte)0x78,
                (byte)0x90, (byte)0x47, (byte)0x5e, (byte)0x8, (byte)0x5c, (byte)0xa,
                (byte)0x66, (byte)0x6e, (byte)0x5e, (byte)0xa6, (byte)0x30, (byte)0x2,
                (byte)0x0, (byte)0xa, (byte)0x5f, (byte)0x97, (byte)0x5e, (byte)0xa6,
                (byte)0xff, (byte)0xc, (byte)0x5f, (byte)0x97, (byte)0x5e, (byte)0xa6,
                (byte)0xff, (byte)0xc, (byte)0x0, (byte)0xa, (byte)0x52, (byte)0x7,
                (byte)0x83, (byte)0xab, (byte)0x67, (byte)0x3a, (byte)0x7f, (byte)0x18,
                (byte)0x51, (byte)0x8d, (byte)0x8b, (byte)0xef, (byte)0x30, (byte)0x2,
                (byte)0x0, (byte)0xa, (byte)0x6e, (byte)0xe1, (byte)0x6c, (byte)0x5f,
                (byte)0x7e, (byte)0xa2, (byte)0x30, (byte)0x0, (byte)0x5c, (byte)0xb3,
                (byte)0x98, (byte)0xde, (byte)0x0, (byte)0xa, (byte)0x60, (byte)0x12,
                (byte)0x53, (byte)0xd1, (byte)0x51, (byte)0xb2, (byte)0x51, (byte)0xa0,
                (byte)0xff, (byte)0xc, (byte)0x51, (byte)0xed, (byte)0x96, (byte)0x11,
                (byte)0x59, (byte)0x4, (byte)0xff, (byte)0xc, (byte)0x6f, (byte)0x47,
                (byte)0x6f, (byte)0x47, (byte)0x96, (byte)0xe8, (byte)0x6b, (byte)0x47,
                (byte)0x30, (byte)0x2, (byte)0x0, (byte)0xa, (byte)0x62, (byte)0xac,
                (byte)0x67, (byte)0x1b, (byte)0x77, (byte)0x3c, (byte)0xff, (byte)0xc,
                (byte)0x4e, (byte)0xf0, (byte)0x59, (byte)0x29, (byte)0x95, (byte)0x7f,
                (byte)0x55, (byte)0x78, (byte)0xff, (byte)0xc, (byte)0x58, (byte)0xee,
                (byte)0x60, (byte)0x0, (byte)0x6f, (byte)0xc0, (byte)0x70, (byte)0xc8,
                (byte)0x30, (byte)0x2, (byte)0x0, (byte)0xa, (byte)0x4e, (byte)0x9,
                (byte)0x53, (byte)0x41, (byte)0x52, (byte)0x9f, (byte)0x54, (byte)0xd,
                (byte)0x5c, (byte)0x18, (byte)0x4e, (byte)0xe, (byte)0x57, (byte)0x1f,
                (byte)0xff, (byte)0xc, (byte)0x51, (byte)0x6b, (byte)0x53, (byte)0x43,
                (byte)0x91, (byte)0xcc, (byte)0x8d, (byte)0xef, (byte)0x4e, (byte)0x91,
                (byte)0x54, (byte)0x8c, (byte)0x67, (byte)0x8, (byte)0x30, (byte)0x2,
                (byte)0x0, (byte)0xa, (byte)0x83, (byte)0xab, (byte)0x7b, (byte)0x49,
                (byte)0x95, (byte)0xf2, (byte)0x76, (byte)0x7d, (byte)0x4e, (byte)0x86,
                (byte)0x5c, (byte)0x11, (byte)0x5e, (byte)0x74, (byte)0x59, (byte)0x34,
                (byte)0xff, (byte)0xc, (byte)0x7a, (byte)0x7a, (byte)0x60, (byte)0xb2,
                (byte)0x52, (byte)0x7, (byte)0x30, (byte)0x2, (byte)0x0, (byte)0xa,
                (byte)0x97, (byte)0x56, (byte)0x5e, (byte)0xb7, (byte)0x80, (byte)0x3b,
                (byte)0xff, (byte)0xc, (byte)0x72, (byte)0xb9, (byte)0x67, (byte)0x2a,
                (byte)0x96, (byte)0xea, (byte)0x30, (byte)0x2, (byte)0x0, (byte)0xa,
                (byte)0x81, (byte)0xe3, (byte)0x5b, (byte)0x50, (byte)0x61, (byte)0xbe,
                (byte)0xff, (byte)0xc, (byte)0x4f, (byte)0x55, (byte)0x65, (byte)0xf6,
                (byte)0x70, (byte)0x6d, (byte)0xff, (byte)0x1f, (byte)0x0, (byte)0xa,
                (byte)0x9a, (byte)0x7e, (byte)0x95, (byte)0x7f, (byte)0x8f, (byte)0x66,
                (byte)0x8e, (byte)0xf, (byte)0x78, (byte)0x34, (byte)0xff, (byte)0xc,
                (byte)0x8d, (byte)0x3a, (byte)0x51, (byte)0x70, (byte)0x5c, (byte)0x71,
                (byte)0x7f, (byte)0x3a, (byte)0x30, (byte)0x2, (byte)0x0, (byte)0xa,
                (byte)0x58, (byte)0xee, (byte)0x5f, (byte)0xd7, (byte)0x99, (byte)0x65,
                (byte)0x99, (byte)0x10, (byte)0x80, (byte)0xe1, (byte)0x86, (byte)0x4f,
                (byte)0x80, (byte)0x89, (byte)0xff, (byte)0xc, (byte)0x7b, (byte)0x11,
                (byte)0x8c, (byte)0x8, (byte)0x6e, (byte)0x34, (byte)0x99, (byte)0x6e,
                (byte)0x53, (byte)0x8, (byte)0x59, (byte)0x74, (byte)0x88, (byte)0x40,
                (byte)0x30, (byte)0x2, (byte)0x0, (byte)0xa, (byte)0x5f, (byte)0x85,
                (byte)0x4e, (byte)0xce, (byte)0x59, (byte)0x34, (byte)0x65, (byte)0x36,
                (byte)0x62, (byte)0xfe, (byte)0x65, (byte)0xe7, (byte)0x5c, (byte)0x71,
                (byte)0x6c, (byte)0xb3, (byte)0xff, (byte)0xc, (byte)0x67, (byte)0x1d,
                (byte)0x59, (byte)0x29, (byte)0x96, (byte)0x19, (byte)0x30, (byte)0x2,
                (byte)0x0, (byte)0xa, (byte)0x0, (byte)0x31, (byte)0x0, (byte)0x32,
                (byte)0x0, (byte)0x33, (byte)0x0, (byte)0x34, (byte)0x0, (byte)0x35,
                (byte)0x0, (byte)0x36, (byte)0x0, (byte)0x37, (byte)0x0, (byte)0x38,
                (byte)0x0, (byte)0x39, (byte)0x0, (byte)0x30, (byte)0x0, (byte)0xa,
                (byte)0x0, (byte)0x61, (byte)0x0, (byte)0x62, (byte)0x0, (byte)0x63,
                (byte)0x0, (byte)0x64, (byte)0x0, (byte)0x65, (byte)0x0, (byte)0x66,
                (byte)0x0, (byte)0x67, (byte)0x0, (byte)0x68, (byte)0x0, (byte)0x69,
                (byte)0x0, (byte)0x6a, (byte)0x0, (byte)0x6b, (byte)0x0, (byte)0x6c,
                (byte)0x0, (byte)0x6d, (byte)0x0, (byte)0x6e, (byte)0x0, (byte)0x6f,
                (byte)0x0, (byte)0x70, (byte)0x0, (byte)0x71, (byte)0x0, (byte)0x72,
                (byte)0x0, (byte)0x73, (byte)0x0, (byte)0x74, (byte)0x0, (byte)0x75,
                (byte)0x0, (byte)0x76, (byte)0x0, (byte)0x77, (byte)0x0, (byte)0x78,
                (byte)0x0, (byte)0x79, (byte)0x0, (byte)0x7a, (byte)0x0, (byte)0xa,
                (byte)0x0, (byte)0x41, (byte)0x0, (byte)0x42, (byte)0x0, (byte)0x43,
                (byte)0x0, (byte)0x44, (byte)0x0, (byte)0x45, (byte)0x0, (byte)0x46,
                (byte)0x0, (byte)0x47, (byte)0x0, (byte)0x48, (byte)0x0, (byte)0x49,
                (byte)0x0, (byte)0x4a, (byte)0x0, (byte)0x4b, (byte)0x0, (byte)0x4c,
                (byte)0x0, (byte)0x4d, (byte)0x0, (byte)0x4e, (byte)0x0, (byte)0x4f,
                (byte)0x0, (byte)0x50, (byte)0x0, (byte)0x51, (byte)0x0, (byte)0x52,
                (byte)0x0, (byte)0x53, (byte)0x0, (byte)0x54, (byte)0x0, (byte)0x55,
                (byte)0x0, (byte)0x56, (byte)0x0, (byte)0x57, (byte)0x0, (byte)0x58,
                (byte)0x0, (byte)0x59, (byte)0x0, (byte)0x5a, (byte)0x0, (byte)0xa,
                (byte)0x0, (byte)0x21, (byte)0x0, (byte)0x40, (byte)0x0, (byte)0x23,
                (byte)0x0, (byte)0x24, (byte)0x0, (byte)0x25, (byte)0x0, (byte)0x5e,
                (byte)0x0, (byte)0x26, (byte)0x0, (byte)0x2a, (byte)0x0, (byte)0x28,
                (byte)0x0, (byte)0x29, (byte)0x0, (byte)0x5f, (byte)0x0, (byte)0x2b,
                (byte)0x0, (byte)0x2d, (byte)0x0, (byte)0x3d, (byte)0x0, (byte)0x7b,
                (byte)0x0, (byte)0x7d, (byte)0x0, (byte)0x5b, (byte)0x0, (byte)0x5d,
                (byte)0x0, (byte)0x3a, (byte)0x0, (byte)0x22, (byte)0x0, (byte)0x7c,
                (byte)0x0, (byte)0x3b, (byte)0x0, (byte)0x27, (byte)0x0, (byte)0x5c,
                (byte)0x0, (byte)0x3c, (byte)0x0, (byte)0x3e, (byte)0x0, (byte)0x3f,
                (byte)0x0, (byte)0x2c, (byte)0x0, (byte)0x2e, (byte)0x0, (byte)0x2f,
                (byte)0x0, (byte)0xa, (byte)0xff, (byte)0x11, (byte)0xff, (byte)0x12,
                (byte)0xff, (byte)0x13, (byte)0xff, (byte)0x14, (byte)0xff, (byte)0x15,
                (byte)0xff, (byte)0x16, (byte)0xff, (byte)0x17, (byte)0xff, (byte)0x18,
                (byte)0xff, (byte)0x19, (byte)0xff, (byte)0x10, (byte)0x0, (byte)0xa,
                (byte)0xff, (byte)0x41, (byte)0xff, (byte)0x42, (byte)0xff, (byte)0x43,
                (byte)0xff, (byte)0x44, (byte)0xff, (byte)0x45, (byte)0xff, (byte)0x46,
                (byte)0xff, (byte)0x47, (byte)0xff, (byte)0x48, (byte)0xff, (byte)0x49,
                (byte)0xff, (byte)0x4a, (byte)0xff, (byte)0x4b, (byte)0xff, (byte)0x4c,
                (byte)0xff, (byte)0x4d, (byte)0xff, (byte)0x4e}, "utf-16");
        } catch (Exception ex) {
            tmp = null;
        }
        CHINESE_COMPLEX_STRING = tmp;
    }

    private I18NStrings()  {
        //utility class
    }
}

