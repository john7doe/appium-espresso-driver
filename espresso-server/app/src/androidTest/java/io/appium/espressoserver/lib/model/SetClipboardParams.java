/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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

package io.appium.espressoserver.lib.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressWarnings("unused")
public class SetClipboardParams extends AppiumParams {
    private ClipboardDataType contentType;
    private String content;
    private String label;

    @NonNull
    public ClipboardDataType getContentType() {
        return this.contentType == null ? ClipboardDataType.PLAINTEXT : this.contentType;
    }

    @Nullable
    public String getContent() {
        return this.content;
    }

    @Nullable
    public String getLabel() {
        return this.label;
    }
}
