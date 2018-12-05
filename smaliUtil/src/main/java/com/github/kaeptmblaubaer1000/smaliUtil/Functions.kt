package com.github.kaeptmblaubaer1000.smaliUtil

import org.jf.dexlib2.AccessFlags
import org.jf.dexlib2.iface.ClassDef

fun `class`(name: String, vararg flags: AccessFlags, closure: ClassBuilder.() -> Unit): ClassDef = ClassBuilder(name, *flags).apply(closure).build()
