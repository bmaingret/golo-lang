/*
 * Copyright 2012-2013 Institut National des Sciences Appliquées de Lyon (INSA-Lyon)
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

package gololang.concurrent.messaging;

/**
 * A messaging function for asynchronously processing messages.
 * <p/>
 * This interface is mostly used to facilitate the design of the Java API, as messaging functions are made out of
 * closures / method handles in Golo.
 */
public interface MessagingFunction {

    /**
     * Called by a messaging executor to process a message.
     *
     * @param message the message to process.
     */
    public void apply(Object message);
}