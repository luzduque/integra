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
package es.gob.afirma.xml.security.c14n;

import es.gob.afirma.xml.security.exceptions.XMLSecurityException;

public class InvalidCanonicalizerException extends XMLSecurityException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor InvalidCanonicalizerException
     *
     */
    public InvalidCanonicalizerException() {
        super();
    }

    /**
     * Constructor InvalidCanonicalizerException
     *
     * @param msgID
     */
    public InvalidCanonicalizerException(String msgID) {
        super(msgID);
    }

    /**
     * Constructor InvalidCanonicalizerException
     *
     * @param msgID
     * @param exArgs
     */
    public InvalidCanonicalizerException(String msgID, Object exArgs[]) {
        super(msgID, exArgs);
    }

    /**
     * Constructor InvalidCanonicalizerException
     *
     * @param msgID
     * @param originalException
     */
    public InvalidCanonicalizerException(String msgID, Exception originalException) {
        super(msgID, originalException);
    }

    /**
     * Constructor InvalidCanonicalizerException
     *
     * @param msgID
     * @param exArgs
     * @param originalException
     */
    public InvalidCanonicalizerException(
        String msgID, Object exArgs[], Exception originalException
    ) {
        super(msgID, exArgs, originalException);
    }
}
