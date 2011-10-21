/*
 * Copyright (c) 2011 David Boissier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codinjutsu.tools.jenkins.logic;


public enum AuthenticationResult {

    SUCCESSFULL(JenkinsRequestManager.SUCCESS_ID, "Successful"),
    UNAUTHORIZED(JenkinsRequestManager.UNAUTHORIZED_ID, "Unauthorized"),
    FAILED(JenkinsRequestManager.FAILED_ID, "Failed to connect");


    private final int id;
    private final String label;


    AuthenticationResult(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static AuthenticationResult find(int id) {
        for (AuthenticationResult authenticationResult : AuthenticationResult.values()) {
            if (authenticationResult.getId() == id) {
                return authenticationResult;
            }
        }

        return null;
    }
}