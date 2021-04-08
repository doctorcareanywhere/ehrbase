/*
 *  Copyright (c) 2020 Vitasystems GmbH and Christian Chevalley (Hannover Medical School).
 *
 *  This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and  limitations under the License.
 *
 */

package org.ehrbase.aql.sql.queryimpl.translator.testcase.pg10.pgsql;

import org.ehrbase.aql.sql.queryimpl.QueryImplConstants;
import org.ehrbase.aql.sql.queryimpl.translator.testcase.UC7;

public class TestUC7 extends UC7 {

    public TestUC7(){
        super();
        this.expectedSqlExpression =
                "select " +
                "("+ QueryImplConstants.AQL_NODE_ITERATIVE_FUNCTION+"((\"ehr\".\"entry\".\"entry\"#>>'{/composition[openEHR-EHR-COMPOSITION.health_summary.v1],/content[openEHR-EHR-ACTION.immunisation_procedure.v1]}')::jsonb)#>>'{/description[at0001],/items[at0002],0,/value,value}') as \"/description[at0001]/items[at0002]/value/value\"" +
                " from \"ehr\".\"entry\"" +
                " where (\"ehr\".\"entry\".\"template_id\" = ? and (\"ehr\".\"entry\".\"entry\" #>> '{/composition[openEHR-EHR-COMPOSITION.health_summary.v1],/content[openEHR-EHR-ACTION.immunisation_procedure.v1],0,/description[at0001],/items[at0002],0,/value,value}'='Hepatitis A'))";
    }
}
