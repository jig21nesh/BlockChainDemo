fun main(args: Array<String>) {
    val demoChain = Chain
    for (i in 1..15) {
        demoChain.addNewBlock(Block(i, demoChain.latestBlock.hash, "Block $i"))
    }
    for (block in demoChain.chain) {
        println("""Data: ${block.data}
            |Previous hash: ${block.previousHash}
            |Current hash: ${block.hash}
            |timestamp: ${block.timestamp}
        |""".trimMargin())
    }
}