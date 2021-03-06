/*
 * Copyright (c) 2019 Uber Technologies, Inc.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.uber.marmaray.common.sources.kafka;

import com.uber.marmaray.common.configuration.KafkaSourceConfiguration;
import lombok.NonNull;
import org.apache.kafka.common.TopicPartition;

import java.util.Map;
import java.util.Set;

public interface IKafkaOffsetSelector {
    Map<Integer, Long> getPartitionOffsets(@NonNull final KafkaSourceConfiguration kafkaConf,
                                           @NonNull final Set<TopicPartition> topicPartitions,
                                           @NonNull final Map<TopicPartition, Long> earliestLeaderOffsets,
                                           @NonNull final Map<TopicPartition, Long> latestLeaderOffsets);
}
