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
package org.apache.cxf.systest.http;

import java.util.concurrent.Future;

import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


import org.apache.cxf.greeter_control.Greeter;
import org.apache.cxf.greeter_control.types.GreetMeResponse;
import org.apache.cxf.greeter_control.types.PingMeResponse;
import org.apache.cxf.greeter_control.types.SayHiResponse;

@WebService(serviceName = "GreeterService",
            portName = "GreeterPort",
            endpointInterface = "org.apache.cxf.greeter_control.Greeter",
            targetNamespace = "http://cxf.apache.org/greeter_control")
public class StatefulGreeterImpl implements Greeter {
    String name;

    // greetMe will use session to return last called name
    public String greetMe(String me) {
        name = me;
        return "Hello " + me;
    }


    public String sayHi() {
        return "Bonjour " + name;
    }

    public void pingMe() {
    }


    public Future<?> greetMeAsync(String requestType, AsyncHandler<GreetMeResponse> asyncHandler) {
        // TODO Auto-generated method stub
        return null;
    }


    public Response<GreetMeResponse> greetMeAsync(String requestType) {
        // TODO Auto-generated method stub
        return null;
    }


    public void greetMeOneWay(String requestType) {
        // TODO Auto-generated method stub

    }


    public Future<?> pingMeAsync(AsyncHandler<PingMeResponse> asyncHandler) {
        // TODO Auto-generated method stub
        return null;
    }


    public Response<PingMeResponse> pingMeAsync() {
        // TODO Auto-generated method stub
        return null;
    }


    public Future<?> sayHiAsync(AsyncHandler<SayHiResponse> asyncHandler) {
        // TODO Auto-generated method stub
        return null;
    }


    public Response<SayHiResponse> sayHiAsync() {
        // TODO Auto-generated method stub
        return null;
    }

}
