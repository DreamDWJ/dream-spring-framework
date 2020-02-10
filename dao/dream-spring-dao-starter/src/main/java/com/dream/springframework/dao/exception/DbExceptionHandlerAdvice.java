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

package com.dream.springframework.dao.exception;

import com.dream.springframework.base.exception.BaseErrorCode;
import com.dream.springframework.base.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Database global exception handler
 *
 * @author DreamJM
 */
@ControllerAdvice
@ResponseBody
public class DbExceptionHandlerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(DbExceptionHandlerAdvice.class);

    @ExceptionHandler(DuplicateKeyException.class)
    public Result handleException(DuplicateKeyException ex, HttpServletResponse response) {
        response.setStatus(HttpStatus.FORBIDDEN.value());
        logger.warn("Duplicate Key Exception: {}", ex.getMessage());
        return new Result(BaseErrorCode.DATA_EXISTS, ex.getMessage());
    }
}
