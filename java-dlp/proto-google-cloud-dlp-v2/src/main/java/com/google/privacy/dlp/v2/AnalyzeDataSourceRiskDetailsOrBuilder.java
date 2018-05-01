// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface AnalyzeDataSourceRiskDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric requested_privacy_metric = 1;</code>
   */
  boolean hasRequestedPrivacyMetric();
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric requested_privacy_metric = 1;</code>
   */
  com.google.privacy.dlp.v2.PrivacyMetric getRequestedPrivacyMetric();
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrivacyMetric requested_privacy_metric = 1;</code>
   */
  com.google.privacy.dlp.v2.PrivacyMetricOrBuilder getRequestedPrivacyMetricOrBuilder();

  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable requested_source_table = 2;</code>
   */
  boolean hasRequestedSourceTable();
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable requested_source_table = 2;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTable getRequestedSourceTable();
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable requested_source_table = 2;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getRequestedSourceTableOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult numerical_stats_result = 3;</code>
   */
  boolean hasNumericalStatsResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult numerical_stats_result = 3;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult getNumericalStatsResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResult numerical_stats_result = 3;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.NumericalStatsResultOrBuilder getNumericalStatsResultOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult categorical_stats_result = 4;</code>
   */
  boolean hasCategoricalStatsResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult categorical_stats_result = 4;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult getCategoricalStatsResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResult categorical_stats_result = 4;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.CategoricalStatsResultOrBuilder getCategoricalStatsResultOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult k_anonymity_result = 5;</code>
   */
  boolean hasKAnonymityResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult k_anonymity_result = 5;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult getKAnonymityResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResult k_anonymity_result = 5;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KAnonymityResultOrBuilder getKAnonymityResultOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult l_diversity_result = 6;</code>
   */
  boolean hasLDiversityResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult l_diversity_result = 6;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult getLDiversityResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResult l_diversity_result = 6;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.LDiversityResultOrBuilder getLDiversityResultOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult k_map_estimation_result = 7;</code>
   */
  boolean hasKMapEstimationResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult k_map_estimation_result = 7;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult getKMapEstimationResult();
  /**
   * <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResult k_map_estimation_result = 7;</code>
   */
  com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.KMapEstimationResultOrBuilder getKMapEstimationResultOrBuilder();

  public com.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails.ResultCase getResultCase();
}
