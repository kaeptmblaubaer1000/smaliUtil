package com.github.kaeptmblaubaer1000.smaliUtil

import org.jf.dexlib2.AccessFlags
import org.jf.dexlib2.iface.ClassDef
import org.jf.dexlib2.immutable.ImmutableClassDef

class ClassBuilder(name: String, vararg flags: AccessFlags) : Builder<ClassDef> {
    private var name = name
    private var flags: Int = flags.fold(0) { i, flag ->
        i or flag.ordinal
    }

    override fun build() = ImmutableClassDef(name, flags, null, null, null, null, null, null)
}
