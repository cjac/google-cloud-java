/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.documentai.v1.samples;

// [START documentai_v1_generated_documentprocessorserviceclient_getprocessorversion_sync]
import com.google.cloud.documentai.v1.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1.GetProcessorVersionRequest;
import com.google.cloud.documentai.v1.ProcessorVersion;
import com.google.cloud.documentai.v1.ProcessorVersionName;

public class SyncGetProcessorVersion {

  public static void main(String[] args) throws Exception {
    syncGetProcessorVersion();
  }

  public static void syncGetProcessorVersion() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      GetProcessorVersionRequest request =
          GetProcessorVersionRequest.newBuilder()
              .setName(
                  ProcessorVersionName.of(
                          "[PROJECT]", "[LOCATION]", "[PROCESSOR]", "[PROCESSOR_VERSION]")
                      .toString())
              .build();
      ProcessorVersion response = documentProcessorServiceClient.getProcessorVersion(request);
    }
  }
}
// [END documentai_v1_generated_documentprocessorserviceclient_getprocessorversion_sync]