/**
 * This class is generated by jOOQ
 */
package models.generated.tables.records


import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import models.generated.tables.Folder

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
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
class FolderRecord extends UpdatableRecordImpl[FolderRecord](Folder.FOLDER) with Record4[Integer, String, String, Integer] {

	/**
	 * Setter for <code>public.folder.id</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.folder.id</code>.
	 */
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>public.folder.owner</code>.
	 */
	def setOwner(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.folder.owner</code>.
	 */
	def getOwner : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.folder.title</code>.
	 */
	def setTitle(value : String) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.folder.title</code>.
	 */
	def getTitle : String = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.folder.parent</code>.
	 */
	def setParent(value : Integer) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>public.folder.parent</code>.
	 */
	def getParent : Integer = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row4[Integer, String, String, Integer] = {
		super.fieldsRow.asInstanceOf[ Row4[Integer, String, String, Integer] ]
	}

	override def valuesRow : Row4[Integer, String, String, Integer] = {
		super.valuesRow.asInstanceOf[ Row4[Integer, String, String, Integer] ]
	}
	override def field1 : Field[Integer] = Folder.FOLDER.ID
	override def field2 : Field[String] = Folder.FOLDER.OWNER
	override def field3 : Field[String] = Folder.FOLDER.TITLE
	override def field4 : Field[Integer] = Folder.FOLDER.PARENT
	override def value1 : Integer = getId
	override def value2 : String = getOwner
	override def value3 : String = getTitle
	override def value4 : Integer = getParent

	override def value1(value : Integer) : FolderRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : FolderRecord = {
		setOwner(value)
		this
	}

	override def value3(value : String) : FolderRecord = {
		setTitle(value)
		this
	}

	override def value4(value : Integer) : FolderRecord = {
		setParent(value)
		this
	}

	override def values(value1 : Integer, value2 : String, value3 : String, value4 : Integer) : FolderRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this
	}

	/**
	 * Create a detached, initialised FolderRecord
	 */
	def this(id : Integer, owner : String, title : String, parent : Integer) = {
		this()

		setValue(0, id)
		setValue(1, owner)
		setValue(2, title)
		setValue(3, parent)
	}
}
