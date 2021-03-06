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

package org.apache.commons.vfs.provider;

import org.apache.commons.vfs.FileSystemOptions;

/**
 * Used to identify a filesystem
 *
 * @author <a href="mailto:imario@apache.org">Mario Ivankovits</a>
 * @version $Revision: 804548 $ $Date: 2009-08-15 22:12:32 -0400 (Sat, 15 Aug 2009) $
 */
class FileSystemKey implements Comparable
{
    private static final FileSystemOptions EMPTY_OPTIONS = new FileSystemOptions();

    private final Comparable key;
    private final FileSystemOptions fileSystemOptions;

    FileSystemKey(final Comparable key, final FileSystemOptions fileSystemOptions)
    {
        this.key = key;
        if (fileSystemOptions != null)
        {
            this.fileSystemOptions = fileSystemOptions;
        }
        else
        {
            this.fileSystemOptions = EMPTY_OPTIONS;
        }
    }

    public int compareTo(Object o)
    {
        FileSystemKey fk = (FileSystemKey) o;

        int ret = key.compareTo(fk.key);
        if (ret != 0)
        {
            // other filesystem
            return ret;
        }

        return fileSystemOptions.compareTo(fk.fileSystemOptions);
    }
}
