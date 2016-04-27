/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.camunda.bpm.engine.identity;

import org.camunda.bpm.engine.query.Query;


/**
 * Allows to programmatically query for {@link Tenant}s.
 */
public interface TenantQuery extends Query<TenantQuery, Tenant> {

  /** Only select {@link Tenant}s with the given id. */
  TenantQuery tenantId(String tenantId);

  /** Only select {@link Tenant}s with the given ids */
  TenantQuery tenantIdIn(String... ids);

  /** Only select {@link Tenant}s with the given name. */
  TenantQuery tenantName(String tenantName);

  /** Only select {@link Tenant}s where the name matches the given parameter.
   *  The syntax to use is that of SQL, eg. %tenant%. */
  TenantQuery tenantNameLike(String tenantNameLike);

  //sorting ////////////////////////////////////////////////////////

  /** Order by tenant id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  TenantQuery orderByTenantId();

  /** Order by tenant name (needs to be followed by {@link #asc()} or {@link #desc()}). */
  TenantQuery orderByTenantName();

}