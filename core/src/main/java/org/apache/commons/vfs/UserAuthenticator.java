/*!
* Copyright 2010 - 2013 Pentaho Corporation.  All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package org.apache.commons.vfs;

/**
 * The user authenticator is used to query credentials from the user. Since a UserAuthenticator
 * is provided with the {@link FileSystemOptions} to a {@link FileSystem} it should also implement
 * reasonable equals and hashCode functions if the FileSystem should be shared.
 * @author <a href="http://commons.apache.org/vfs/team-list.html">Commons VFS team</a>
 */
public interface UserAuthenticator
{
    /**
     * Queries the given type from the user.
     * @param types An array containing the user's credentials
     * @return The UserAuthenticationData.
     */
    UserAuthenticationData requestAuthentication(UserAuthenticationData.Type[] types);
}
