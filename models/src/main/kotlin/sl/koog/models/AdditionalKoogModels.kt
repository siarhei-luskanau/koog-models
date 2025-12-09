package sl.koog.models

import ai.koog.prompt.llm.LLMCapability
import ai.koog.prompt.llm.LLMProvider
import ai.koog.prompt.llm.LLModel

object AdditionalKoogModels {
    object Ollama {
        val GPT_OSS_20B: LLModel =
            // "https://ollama.com/library/gpt-oss"
            LLModel(
                provider = LLMProvider.Ollama,
                id = "gpt-oss:20b",
                capabilities =
                    listOf(
                        LLMCapability.Completion,
                        LLMCapability.Schema.JSON.Standard,
                        LLMCapability.Speculation,
                        LLMCapability.Temperature,
                        LLMCapability.ToolChoice,
                        LLMCapability.Tools,
                    ),
                contextLength = 128_000,
            )
    }
}
