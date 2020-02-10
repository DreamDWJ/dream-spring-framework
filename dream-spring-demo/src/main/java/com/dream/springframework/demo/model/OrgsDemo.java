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

package com.dream.springframework.demo.model;

import com.dream.springframework.auth.base.model.CheckedOrgs;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;
import java.util.List;

/**
 * @author DreamJM
 */
public class OrgsDemo implements CheckedOrgs<Organ> {

    private List<String> orgIds;

    @JsonIgnore
    private List<Organ> checkedOrgs;

    public List<String> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public List<Organ> getCheckedOrgs() {
        return checkedOrgs;
    }

    @Override
    public Collection<String> getCheckOrgIds() {
        return orgIds;
    }

    @Override
    public void setCheckedOrgs(List<Organ> checkedOrgs) {
        this.checkedOrgs = checkedOrgs;
    }
}
