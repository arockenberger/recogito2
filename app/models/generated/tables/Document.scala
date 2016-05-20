/**
 * This class is generated by jOOQ
 */
package models.generated.tables


import java.lang.Class
import java.lang.String
import java.sql.Timestamp
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.generated.Keys
import models.generated.Public
import models.generated.tables.records.DocumentRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object Document {

	/**
	 * The reference instance of <code>public.document</code>
	 */
	val DOCUMENT = new Document
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
class Document(alias : String, aliased : Table[DocumentRecord], parameters : Array[ Field[_] ]) extends TableImpl[DocumentRecord](alias, Public.PUBLIC, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[DocumentRecord] = {
		classOf[DocumentRecord]
	}

	/**
	 * The column <code>public.document.id</code>.
	 */
	val ID : TableField[DocumentRecord, String] = createField("id", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.document.owner</code>.
	 */
	val OWNER : TableField[DocumentRecord, String] = createField("owner", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.document.uploaded_at</code>.
	 */
	val UPLOADED_AT : TableField[DocumentRecord, Timestamp] = createField("uploaded_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), "")

	/**
	 * The column <code>public.document.title</code>.
	 */
	val TITLE : TableField[DocumentRecord, String] = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>public.document.author</code>.
	 */
	val AUTHOR : TableField[DocumentRecord, String] = createField("author", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>public.document.date_numeric</code>.
	 */
	val DATE_NUMERIC : TableField[DocumentRecord, Timestamp] = createField("date_numeric", org.jooq.impl.SQLDataType.TIMESTAMP, "")

	/**
	 * The column <code>public.document.date_freeform</code>.
	 */
	val DATE_FREEFORM : TableField[DocumentRecord, String] = createField("date_freeform", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>public.document.description</code>.
	 */
	val DESCRIPTION : TableField[DocumentRecord, String] = createField("description", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>public.document.source</code>.
	 */
	val SOURCE : TableField[DocumentRecord, String] = createField("source", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>public.document.language</code>.
	 */
	val LANGUAGE : TableField[DocumentRecord, String] = createField("language", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * Create a <code>public.document</code> table reference
	 */
	def this() = {
		this("document", null, null)
	}

	/**
	 * Create an aliased <code>public.document</code> table reference
	 */
	def this(alias : String) = {
		this(alias, models.generated.tables.Document.DOCUMENT, null)
	}

	private def this(alias : String, aliased : Table[DocumentRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[DocumentRecord] = {
		Keys.DOCUMENT_PKEY
	}

	override def getKeys : List[ UniqueKey[DocumentRecord] ] = {
		return Arrays.asList[ UniqueKey[DocumentRecord] ](Keys.DOCUMENT_PKEY)
	}

	override def getReferences : List[ ForeignKey[DocumentRecord, _] ] = {
		return Arrays.asList[ ForeignKey[DocumentRecord, _] ](Keys.DOCUMENT__DOCUMENT_OWNER_FKEY)
	}

	override def as(alias : String) : Document = {
		new Document(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : Document = {
		new Document(name, null)
	}
}
