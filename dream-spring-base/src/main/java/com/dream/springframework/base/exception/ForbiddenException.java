/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dream.springframework.base.exception;

import org.springframework.http.HttpStatus;

/**
 * Forbidden Exception with http response code 403
 *
 * @author DreamJM
 * @see RequestException
 */
public class ForbiddenException extends RequestException {

    public ForbiddenException(int code) {
        super(code);
    }

    public ForbiddenException(int code, Object[] params) {
        super(code, params);
    }

    public ForbiddenException(int code, String msg) {
        super(code, msg);
    }

    public ForbiddenException(int code, String msg, Throwable throwable) {
        super(code, msg, throwable);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.FORBIDDEN;
    }
}
