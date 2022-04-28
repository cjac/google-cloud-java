/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/metrics.proto

package com.google.monitoring.dashboard.v1;

public interface TimeSeriesFilterRatioOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.TimeSeriesFilterRatio)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The numerator of the ratio.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart numerator = 1;</code>
   *
   * @return Whether the numerator field is set.
   */
  boolean hasNumerator();
  /**
   *
   *
   * <pre>
   * The numerator of the ratio.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart numerator = 1;</code>
   *
   * @return The numerator.
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart getNumerator();
  /**
   *
   *
   * <pre>
   * The numerator of the ratio.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart numerator = 1;</code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPartOrBuilder
      getNumeratorOrBuilder();

  /**
   *
   *
   * <pre>
   * The denominator of the ratio.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart denominator = 2;</code>
   *
   * @return Whether the denominator field is set.
   */
  boolean hasDenominator();
  /**
   *
   *
   * <pre>
   * The denominator of the ratio.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart denominator = 2;</code>
   *
   * @return The denominator.
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart getDenominator();
  /**
   *
   *
   * <pre>
   * The denominator of the ratio.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPart denominator = 2;</code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.RatioPartOrBuilder
      getDenominatorOrBuilder();

  /**
   *
   *
   * <pre>
   * Apply a second aggregation after the ratio is computed.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation secondary_aggregation = 3;</code>
   *
   * @return Whether the secondaryAggregation field is set.
   */
  boolean hasSecondaryAggregation();
  /**
   *
   *
   * <pre>
   * Apply a second aggregation after the ratio is computed.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation secondary_aggregation = 3;</code>
   *
   * @return The secondaryAggregation.
   */
  com.google.monitoring.dashboard.v1.Aggregation getSecondaryAggregation();
  /**
   *
   *
   * <pre>
   * Apply a second aggregation after the ratio is computed.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation secondary_aggregation = 3;</code>
   */
  com.google.monitoring.dashboard.v1.AggregationOrBuilder getSecondaryAggregationOrBuilder();

  /**
   *
   *
   * <pre>
   * Ranking based time series filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter pick_time_series_filter = 4;</code>
   *
   * @return Whether the pickTimeSeriesFilter field is set.
   */
  boolean hasPickTimeSeriesFilter();
  /**
   *
   *
   * <pre>
   * Ranking based time series filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter pick_time_series_filter = 4;</code>
   *
   * @return The pickTimeSeriesFilter.
   */
  com.google.monitoring.dashboard.v1.PickTimeSeriesFilter getPickTimeSeriesFilter();
  /**
   *
   *
   * <pre>
   * Ranking based time series filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter pick_time_series_filter = 4;</code>
   */
  com.google.monitoring.dashboard.v1.PickTimeSeriesFilterOrBuilder
      getPickTimeSeriesFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Statistics based time series filter.
   * Note: This field is deprecated and completely ignored by the API.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter statistical_time_series_filter = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.dashboard.v1.TimeSeriesFilterRatio.statistical_time_series_filter
   *     is deprecated. See google/monitoring/dashboard/v1/metrics.proto;l=115
   * @return Whether the statisticalTimeSeriesFilter field is set.
   */
  @java.lang.Deprecated
  boolean hasStatisticalTimeSeriesFilter();
  /**
   *
   *
   * <pre>
   * Statistics based time series filter.
   * Note: This field is deprecated and completely ignored by the API.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter statistical_time_series_filter = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.dashboard.v1.TimeSeriesFilterRatio.statistical_time_series_filter
   *     is deprecated. See google/monitoring/dashboard/v1/metrics.proto;l=115
   * @return The statisticalTimeSeriesFilter.
   */
  @java.lang.Deprecated
  com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter getStatisticalTimeSeriesFilter();
  /**
   *
   *
   * <pre>
   * Statistics based time series filter.
   * Note: This field is deprecated and completely ignored by the API.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter statistical_time_series_filter = 5 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilterOrBuilder
      getStatisticalTimeSeriesFilterOrBuilder();

  public com.google.monitoring.dashboard.v1.TimeSeriesFilterRatio.OutputFilterCase
      getOutputFilterCase();
}
