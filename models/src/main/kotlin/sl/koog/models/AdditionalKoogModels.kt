package sl.koog.models

import ai.koog.prompt.llm.LLMCapability
import ai.koog.prompt.llm.LLMProvider
import ai.koog.prompt.llm.LLModel

object AdditionalKoogModels {
    object Ollama {
        val DEEPSEEK_OCR_3B: LLModel =
            // "https://ollama.com/library/deepseek-ocr"
            LLModel(
                provider = LLMProvider.Ollama,
                id = "deepseek-ocr:3b",
                capabilities =
                    listOf(
                        LLMCapability.Document,
                        LLMCapability.Schema.JSON.Basic,
                        LLMCapability.Temperature,
                        LLMCapability.Tools,
                        LLMCapability.Vision.Image,
                    ),
                contextLength = 8_000,
            )
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
        val MINISTRAL_3_8B: LLModel =
            // "https://ollama.com/library/ministral-3"
            LLModel(
                provider = LLMProvider.Ollama,
                id = "ministral-3:8b",
                capabilities =
                    listOf(
                        LLMCapability.Completion,
                        LLMCapability.Schema.JSON.Standard,
                        LLMCapability.Speculation,
                        LLMCapability.Temperature,
                        LLMCapability.ToolChoice,
                        LLMCapability.Tools,
                        LLMCapability.Vision.Image,
                    ),
                contextLength = 256_000,
            )
        val MISTRAL_SMALL3_1: LLModel =
            // "https://ollama.com/library/mistral-small3.1"
            LLModel(
                provider = LLMProvider.Ollama,
                id = "mistral-small3.1",
                capabilities =
                    listOf(
                        LLMCapability.Document,
                        LLMCapability.Schema.JSON.Basic,
                        LLMCapability.Temperature,
                        LLMCapability.Tools,
                        LLMCapability.Vision.Image,
                    ),
                contextLength = 128_000,
            )
        val MISTRAL_SMALL3_2: LLModel =
            // "https://ollama.com/library/mistral-small3.2"
            LLModel(
                provider = LLMProvider.Ollama,
                id = "mistral-small3.2",
                capabilities =
                    listOf(
                        LLMCapability.Document,
                        LLMCapability.Schema.JSON.Basic,
                        LLMCapability.Temperature,
                        LLMCapability.Tools,
                        LLMCapability.Vision.Image,
                    ),
                contextLength = 128_000,
            )
    }
}
