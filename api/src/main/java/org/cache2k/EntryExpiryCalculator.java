package org.cache2k;

/*
 * #%L
 * cache2k API
 * %%
 * Copyright (C) 2000 - 2016 headissue GmbH, Munich
 * %%
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
 * #L%
 */

import org.cache2k.customization.ExpiryCalculator;

/**
 * @deprecated replaced with {@link ExpiryCalculator}
 */
public interface EntryExpiryCalculator<K, V> extends ExpiryCalculator<K,V> {

  /**
   */
  long calculateExpiryTime(
    K _key,
    V _value,
    long _loadTime,
    CacheEntry<K, V> _oldEntry);

}
