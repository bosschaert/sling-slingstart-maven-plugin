/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.maven.slingstart;

public class ReadFeatureModelTest {
    /*
    @Test
    public void testReadSimpleFeatureModel() {
        Feature lf = readFeature("/launchpad-feature.json", am);
        Feature jf = readFeature("/johnzon-feature.json", am);

    }

    private Feature readFeature(final String res,
            final ArtifactManager artifactManager) throws Exception {
        URL url = getClass().getResource(res);
        String file = new File(url.toURI()).getAbsolutePath();
        final ArtifactHandler featureArtifact = artifactManager.getArtifactHandler(file);

        try (final FileReader r = new FileReader(featureArtifact.getFile())) {
            final Feature f = FeatureJSONReader.read(r, featureArtifact.getUrl());
            return f;
        }
    }
    */
}
