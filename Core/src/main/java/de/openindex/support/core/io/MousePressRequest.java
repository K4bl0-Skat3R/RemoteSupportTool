/*
 * Copyright 2015-2018 OpenIndex.de.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package de.openindex.support.core.io;

import java.awt.event.MouseEvent;
import java.io.Serializable;

/**
 * Request for a mouse button being pressed.
 *
 * @author Andreas Rudolph
 */
public class MousePressRequest implements Serializable {
    private static final long serialVersionUID = 1;
    public final int buttons;

    public MousePressRequest() {
        this(MouseEvent.NOBUTTON);
    }

    public MousePressRequest(int buttons) {
        super();
        this.buttons = buttons;
    }
}
