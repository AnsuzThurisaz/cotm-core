import java.io.File

logger.info("initializing credits")

filename = "credits.md"
generator = object : TomeGenerator() {
    override suspend fun generateHtml(modpack: ModPack, lockPack: LockPack, targetFolder: File): String {
        logger.info("writing credits for pack ${modpack.id}")

        return buildString {
            append(
                """# ${lockPack.title()}
                    |**Authors:** ${lockPack.authors.joinToString(", ")}
                    |
                    |""".trimMargin()
            )

            modpack.lockEntrySet.sortedBy { it.displayName.toLowerCase() }.forEach { entry ->
                val provider = Providers[entry.provider]
                val thumbnailUrl = provider.getThumbnail(entry)
                val title = provider.generateName(entry)
                val projectPage = provider.getProjectPage(entry)
                val modAuthors = provider.getAuthors(entry)
                if (thumbnailUrl.isNotEmpty())
                    append("""<img src="$thumbnailUrl" width=100 style="margin:0;margin-right:16px">""")
                append(
                    """[**$title**]($projectPage)  \
                            |**Author(s):** ${modAuthors.joinToString(", ")}
                            |  \
                            |""".trimMargin()
                )
            }
        }
    }
}
