/**
 * This class is generated by jOOQ
 */
package models.generated.tables.records


import java.lang.Integer
import java.lang.String
import java.sql.Timestamp

import javax.annotation.Generated

import models.generated.tables.Upload

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record9
import org.jooq.Row9
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
class UploadRecord extends UpdatableRecordImpl[UploadRecord](Upload.UPLOAD) with Record9[Integer, String, Timestamp, String, String, String, String, String, String] {

	/**
	 * Setter for <code>public.upload.id</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.upload.id</code>.
	 */
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>public.upload.owner</code>.
	 */
	def setOwner(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.upload.owner</code>.
	 */
	def getOwner : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.upload.created_at</code>.
	 */
	def setCreatedAt(value : Timestamp) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.upload.created_at</code>.
	 */
	def getCreatedAt : Timestamp = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	/**
	 * Setter for <code>public.upload.title</code>.
	 */
	def setTitle(value : String) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>public.upload.title</code>.
	 */
	def getTitle : String = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.upload.author</code>.
	 */
	def setAuthor(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>public.upload.author</code>.
	 */
	def getAuthor : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.upload.date_freeform</code>.
	 */
	def setDateFreeform(value : String) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>public.upload.date_freeform</code>.
	 */
	def getDateFreeform : String = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.upload.description</code>.
	 */
	def setDescription(value : String) : Unit = {
		setValue(6, value)
	}

	/**
	 * Getter for <code>public.upload.description</code>.
	 */
	def getDescription : String = {
		val r = getValue(6)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.upload.source</code>.
	 */
	def setSource(value : String) : Unit = {
		setValue(7, value)
	}

	/**
	 * Getter for <code>public.upload.source</code>.
	 */
	def getSource : String = {
		val r = getValue(7)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.upload.language</code>.
	 */
	def setLanguage(value : String) : Unit = {
		setValue(8, value)
	}

	/**
	 * Getter for <code>public.upload.language</code>.
	 */
	def getLanguage : String = {
		val r = getValue(8)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row9[Integer, String, Timestamp, String, String, String, String, String, String] = {
		super.fieldsRow.asInstanceOf[ Row9[Integer, String, Timestamp, String, String, String, String, String, String] ]
	}

	override def valuesRow : Row9[Integer, String, Timestamp, String, String, String, String, String, String] = {
		super.valuesRow.asInstanceOf[ Row9[Integer, String, Timestamp, String, String, String, String, String, String] ]
	}
	override def field1 : Field[Integer] = Upload.UPLOAD.ID
	override def field2 : Field[String] = Upload.UPLOAD.OWNER
	override def field3 : Field[Timestamp] = Upload.UPLOAD.CREATED_AT
	override def field4 : Field[String] = Upload.UPLOAD.TITLE
	override def field5 : Field[String] = Upload.UPLOAD.AUTHOR
	override def field6 : Field[String] = Upload.UPLOAD.DATE_FREEFORM
	override def field7 : Field[String] = Upload.UPLOAD.DESCRIPTION
	override def field8 : Field[String] = Upload.UPLOAD.SOURCE
	override def field9 : Field[String] = Upload.UPLOAD.LANGUAGE
	override def value1 : Integer = getId
	override def value2 : String = getOwner
	override def value3 : Timestamp = getCreatedAt
	override def value4 : String = getTitle
	override def value5 : String = getAuthor
	override def value6 : String = getDateFreeform
	override def value7 : String = getDescription
	override def value8 : String = getSource
	override def value9 : String = getLanguage

	override def value1(value : Integer) : UploadRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : UploadRecord = {
		setOwner(value)
		this
	}

	override def value3(value : Timestamp) : UploadRecord = {
		setCreatedAt(value)
		this
	}

	override def value4(value : String) : UploadRecord = {
		setTitle(value)
		this
	}

	override def value5(value : String) : UploadRecord = {
		setAuthor(value)
		this
	}

	override def value6(value : String) : UploadRecord = {
		setDateFreeform(value)
		this
	}

	override def value7(value : String) : UploadRecord = {
		setDescription(value)
		this
	}

	override def value8(value : String) : UploadRecord = {
		setSource(value)
		this
	}

	override def value9(value : String) : UploadRecord = {
		setLanguage(value)
		this
	}

	override def values(value1 : Integer, value2 : String, value3 : Timestamp, value4 : String, value5 : String, value6 : String, value7 : String, value8 : String, value9 : String) : UploadRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this.value6(value6)
		this.value7(value7)
		this.value8(value8)
		this.value9(value9)
		this
	}

	/**
	 * Create a detached, initialised UploadRecord
	 */
	def this(id : Integer, owner : String, createdAt : Timestamp, title : String, author : String, dateFreeform : String, description : String, source : String, language : String) = {
		this()

		setValue(0, id)
		setValue(1, owner)
		setValue(2, createdAt)
		setValue(3, title)
		setValue(4, author)
		setValue(5, dateFreeform)
		setValue(6, description)
		setValue(7, source)
		setValue(8, language)
	}
}
