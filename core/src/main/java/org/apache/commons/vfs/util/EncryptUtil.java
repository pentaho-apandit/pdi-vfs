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

package org.apache.commons.vfs.util;

/**
 * Allows passwords to be encrypted and decrypted.
 * @author <a href="http://commons.apache.org/vfs/team-list.html">Commons VFS team</a>
 */
public final class EncryptUtil
{
    /**
     * Don't allow class instantiation.
     */
    private EncryptUtil()
    {
    }

    /**
     * This class can be called with "encrypt" password as the arguments where encrypt is
     * a literal and password is replaced with the clear text password to be encrypted.
     *
     * @param args The arguments in the form "command" parm1, parm2.
     * @throws Exception If an error occurs.
     */
    public static void main(String[] args) throws Exception
    {
        if (args.length != 2 || !(args[0].equals("encrypt")))
        {
            System.err.println("Usage: \"EncryptUtil encrypt\" password");
            System.err.println("     password : The clear text password to encrypt");
            System.exit(0);
        }
        Cryptor cryptor = CryptorFactory.getCryptor();

        if (args[0].equals("encrypt"))
        {
            System.out.println(cryptor.encrypt(args[1]));
        }
    }
}
