/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.mvp.client.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Use this annotation in classes implementing
 * {@link com.gwtplatform.mvp.client.TabContainerPresenter}.
 * This annotates a static field containing the type of the event fired when the
 * a child tab changes. <b>Important!</b> The corresponding type must be passed to the parent's
 * constructor.
 *
 * @author Philippe Beaudoin
 */
@Target(ElementType.FIELD)
public @interface ChangeTab {
}
