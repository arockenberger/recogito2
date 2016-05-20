/**
 * This class is generated by jOOQ
 */
package models.generated.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.generated.Keys
import models.generated.Public
import models.generated.tables.records.FolderRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object Folder {

	/**
	 * The reference instance of <code>public.folder</code>
	 */
	val FOLDER = new Folder
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	),
	comments = "This class is generated by jOOQ"
)
class Folder(alias : String, aliased : Table[FolderRecord], parameters : Array[ Field[_] ]) extends TableImpl[FolderRecord](alias, Public.PUBLIC, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[FolderRecord] = {
		classOf[FolderRecord]
	}

	/**
	 * The column <code>public.folder.id</code>.
	 */
	val ID : TableField[FolderRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), "")

	/**
	 * The column <code>public.folder.owner</code>.
	 */
	val OWNER : TableField[FolderRecord, String] = createField("owner", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.folder.title</code>.
	 */
	val TITLE : TableField[FolderRecord, String] = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.folder.parent</code>.
	 */
	val PARENT : TableField[FolderRecord, Integer] = createField("parent", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * Create a <code>public.folder</code> table reference
	 */
	def this() = {
		this("folder", null, null)
	}

	/**
	 * Create an aliased <code>public.folder</code> table reference
	 */
	def this(alias : String) = {
		this(alias, models.generated.tables.Folder.FOLDER, null)
	}

	private def this(alias : String, aliased : Table[FolderRecord]) = {
		this(alias, aliased, null)
	}

	override def getIdentity : Identity[FolderRecord, Integer] = {
		Keys.IDENTITY_FOLDER
	}

	override def getPrimaryKey : UniqueKey[FolderRecord] = {
		Keys.FOLDER_PKEY
	}

	override def getKeys : List[ UniqueKey[FolderRecord] ] = {
		return Arrays.asList[ UniqueKey[FolderRecord] ](Keys.FOLDER_PKEY)
	}

	override def getReferences : List[ ForeignKey[FolderRecord, _] ] = {
		return Arrays.asList[ ForeignKey[FolderRecord, _] ](Keys.FOLDER__FOLDER_OWNER_FKEY, Keys.FOLDER__FOLDER_PARENT_FKEY)
	}

	override def as(alias : String) : Folder = {
		new Folder(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : Folder = {
		new Folder(name, null)
	}
}
