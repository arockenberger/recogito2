/**
 * This class is generated by jOOQ
 */
package models.generated.tables


import java.lang.Class
import java.lang.Float
import java.lang.Integer
import java.lang.String
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.generated.Keys
import models.generated.Public
import models.generated.tables.records.UploadFilepartRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object UploadFilepart {

	/**
	 * The reference instance of <code>public.upload_filepart</code>
	 */
	val UPLOAD_FILEPART = new UploadFilepart
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
class UploadFilepart(alias : String, aliased : Table[UploadFilepartRecord], parameters : Array[ Field[_] ]) extends TableImpl[UploadFilepartRecord](alias, Public.PUBLIC, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[UploadFilepartRecord] = {
		classOf[UploadFilepartRecord]
	}

	/**
	 * The column <code>public.upload_filepart.id</code>.
	 */
	val ID : TableField[UploadFilepartRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), "")

	/**
	 * The column <code>public.upload_filepart.upload_id</code>.
	 */
	val UPLOAD_ID : TableField[UploadFilepartRecord, Integer] = createField("upload_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

	/**
	 * The column <code>public.upload_filepart.owner</code>.
	 */
	val OWNER : TableField[UploadFilepartRecord, String] = createField("owner", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.upload_filepart.title</code>.
	 */
	val TITLE : TableField[UploadFilepartRecord, String] = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.upload_filepart.content_type</code>.
	 */
	val CONTENT_TYPE : TableField[UploadFilepartRecord, String] = createField("content_type", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.upload_filepart.filename</code>.
	 */
	val FILENAME : TableField[UploadFilepartRecord, String] = createField("filename", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.upload_filepart.filesize_kb</code>.
	 */
	val FILESIZE_KB : TableField[UploadFilepartRecord, Float] = createField("filesize_kb", org.jooq.impl.SQLDataType.REAL, "")

	/**
	 * Create a <code>public.upload_filepart</code> table reference
	 */
	def this() = {
		this("upload_filepart", null, null)
	}

	/**
	 * Create an aliased <code>public.upload_filepart</code> table reference
	 */
	def this(alias : String) = {
		this(alias, models.generated.tables.UploadFilepart.UPLOAD_FILEPART, null)
	}

	private def this(alias : String, aliased : Table[UploadFilepartRecord]) = {
		this(alias, aliased, null)
	}

	override def getIdentity : Identity[UploadFilepartRecord, Integer] = {
		Keys.IDENTITY_UPLOAD_FILEPART
	}

	override def getPrimaryKey : UniqueKey[UploadFilepartRecord] = {
		Keys.UPLOAD_FILEPART_PKEY
	}

	override def getKeys : List[ UniqueKey[UploadFilepartRecord] ] = {
		return Arrays.asList[ UniqueKey[UploadFilepartRecord] ](Keys.UPLOAD_FILEPART_PKEY, Keys.UPLOAD_FILEPART_OWNER_TITLE_KEY)
	}

	override def getReferences : List[ ForeignKey[UploadFilepartRecord, _] ] = {
		return Arrays.asList[ ForeignKey[UploadFilepartRecord, _] ](Keys.UPLOAD_FILEPART__UPLOAD_FILEPART_UPLOAD_ID_FKEY, Keys.UPLOAD_FILEPART__UPLOAD_FILEPART_OWNER_FKEY)
	}

	override def as(alias : String) : UploadFilepart = {
		new UploadFilepart(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : UploadFilepart = {
		new UploadFilepart(name, null)
	}
}
