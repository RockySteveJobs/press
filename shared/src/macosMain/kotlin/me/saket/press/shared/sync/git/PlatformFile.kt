package me.saket.press.shared.sync.git

actual class PlatformFile actual constructor(parentPath: String, name: String) : File {
  override val path: String get() = TODO()
  override val name: String get() = TODO()

  actual constructor(path: String) : this("foo", "bar") { TODO() }

  override fun write(input: String): Unit = TODO()
  override fun copy(name: String): File = TODO()
  override fun makeDirectory(): Unit = TODO()
  override fun delete(recursively: Boolean): Unit = TODO()
  override fun children(): List<File> = TODO()
}