/**
 * This class is generated by jOOQ
 */
package models.generated.tables.records


import java.lang.String
import java.sql.Timestamp

import javax.annotation.Generated

import models.generated.tables.Document

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record10
import org.jooq.Row10
import org.jooq.impl.UpdatableRecordImpl


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
class DocumentRecord extends UpdatableRecordImpl[DocumentRecord](Document.DOCUMENT) with Record10[String, String, Timestamp, String, String, Timestamp, String, String, String, String] {

	/**
	 * Setter for <code>public.document.id</code>.
	 */
	def setId(value : String) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.document.id</code>.
	 */
	def getId : String = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.owner</code>.
	 */
	def setOwner(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.document.owner</code>.
	 */
	def getOwner : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.uploaded_at</code>.
	 */
	def setUploadedAt(value : Timestamp) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.document.uploaded_at</code>.
	 */
	def getUploadedAt : Timestamp = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	/**
	 * Setter for <code>public.document.title</code>.
	 */
	def setTitle(value : String) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>public.document.title</code>.
	 */
	def getTitle : String = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.author</code>.
	 */
	def setAuthor(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>public.document.author</code>.
	 */
	def getAuthor : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.date_numeric</code>.
	 */
	def setDateNumeric(value : Timestamp) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>public.document.date_numeric</code>.
	 */
	def getDateNumeric : Timestamp = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	/**
	 * Setter for <code>public.document.date_freeform</code>.
	 */
	def setDateFreeform(value : String) : Unit = {
		setValue(6, value)
	}

	/**
	 * Getter for <code>public.document.date_freeform</code>.
	 */
	def getDateFreeform : String = {
		val r = getValue(6)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.description</code>.
	 */
	def setDescription(value : String) : Unit = {
		setValue(7, value)
	}

	/**
	 * Getter for <code>public.document.description</code>.
	 */
	def getDescription : String = {
		val r = getValue(7)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.source</code>.
	 */
	def setSource(value : String) : Unit = {
		setValue(8, value)
	}

	/**
	 * Getter for <code>public.document.source</code>.
	 */
	def getSource : String = {
		val r = getValue(8)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document.language</code>.
	 */
	def setLanguage(value : String) : Unit = {
		setValue(9, value)
	}

	/**
	 * Getter for <code>public.document.language</code>.
	 */
	def getLanguage : String = {
		val r = getValue(9)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[String] = {
		return super.key.asInstanceOf[ Record1[String] ]
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row10[String, String, Timestamp, String, String, Timestamp, String, String, String, String] = {
		super.fieldsRow.asInstanceOf[ Row10[String, String, Timestamp, String, String, Timestamp, String, String, String, String] ]
	}

	override def valuesRow : Row10[String, String, Timestamp, String, String, Timestamp, String, String, String, String] = {
		super.valuesRow.asInstanceOf[ Row10[String, String, Timestamp, String, String, Timestamp, String, String, String, String] ]
	}
	override def field1 : Field[String] = Document.DOCUMENT.ID
	override def field2 : Field[String] = Document.DOCUMENT.OWNER
	override def field3 : Field[Timestamp] = Document.DOCUMENT.UPLOADED_AT
	override def field4 : Field[String] = Document.DOCUMENT.TITLE
	override def field5 : Field[String] = Document.DOCUMENT.AUTHOR
	override def field6 : Field[Timestamp] = Document.DOCUMENT.DATE_NUMERIC
	override def field7 : Field[String] = Document.DOCUMENT.DATE_FREEFORM
	override def field8 : Field[String] = Document.DOCUMENT.DESCRIPTION
	override def field9 : Field[String] = Document.DOCUMENT.SOURCE
	override def field10 : Field[String] = Document.DOCUMENT.LANGUAGE
	override def value1 : String = getId
	override def value2 : String = getOwner
	override def value3 : Timestamp = getUploadedAt
	override def value4 : String = getTitle
	override def value5 : String = getAuthor
	override def value6 : Timestamp = getDateNumeric
	override def value7 : String = getDateFreeform
	override def value8 : String = getDescription
	override def value9 : String = getSource
	override def value10 : String = getLanguage

	override def value1(value : String) : DocumentRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : DocumentRecord = {
		setOwner(value)
		this
	}

	override def value3(value : Timestamp) : DocumentRecord = {
		setUploadedAt(value)
		this
	}

	override def value4(value : String) : DocumentRecord = {
		setTitle(value)
		this
	}

	override def value5(value : String) : DocumentRecord = {
		setAuthor(value)
		this
	}

	override def value6(value : Timestamp) : DocumentRecord = {
		setDateNumeric(value)
		this
	}

	override def value7(value : String) : DocumentRecord = {
		setDateFreeform(value)
		this
	}

	override def value8(value : String) : DocumentRecord = {
		setDescription(value)
		this
	}

	override def value9(value : String) : DocumentRecord = {
		setSource(value)
		this
	}

	override def value10(value : String) : DocumentRecord = {
		setLanguage(value)
		this
	}

	override def values(value1 : String, value2 : String, value3 : Timestamp, value4 : String, value5 : String, value6 : Timestamp, value7 : String, value8 : String, value9 : String, value10 : String) : DocumentRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this.value6(value6)
		this.value7(value7)
		this.value8(value8)
		this.value9(value9)
		this.value10(value10)
		this
	}

	/**
	 * Create a detached, initialised DocumentRecord
	 */
	def this(id : String, owner : String, uploadedAt : Timestamp, title : String, author : String, dateNumeric : Timestamp, dateFreeform : String, description : String, source : String, language : String) = {
		this()

		setValue(0, id)
		setValue(1, owner)
		setValue(2, uploadedAt)
		setValue(3, title)
		setValue(4, author)
		setValue(5, dateNumeric)
		setValue(6, dateFreeform)
		setValue(7, description)
		setValue(8, source)
		setValue(9, language)
	}
}
