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
import models.generated.tables.records.FolderAssociationRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Table
import org.jooq.TableField
import org.jooq.impl.TableImpl


object FolderAssociation {

	/**
	 * The reference instance of <code>public.folder_association</code>
	 */
	val FOLDER_ASSOCIATION = new FolderAssociation
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
class FolderAssociation(alias : String, aliased : Table[FolderAssociationRecord], parameters : Array[ Field[_] ]) extends TableImpl[FolderAssociationRecord](alias, Public.PUBLIC, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[FolderAssociationRecord] = {
		classOf[FolderAssociationRecord]
	}

	/**
	 * The column <code>public.folder_association.folder_id</code>.
	 */
	val FOLDER_ID : TableField[FolderAssociationRecord, Integer] = createField("folder_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

	/**
	 * The column <code>public.folder_association.document_id</code>.
	 */
	val DOCUMENT_ID : TableField[FolderAssociationRecord, String] = createField("document_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * Create a <code>public.folder_association</code> table reference
	 */
	def this() = {
		this("folder_association", null, null)
	}

	/**
	 * Create an aliased <code>public.folder_association</code> table reference
	 */
	def this(alias : String) = {
		this(alias, models.generated.tables.FolderAssociation.FOLDER_ASSOCIATION, null)
	}

	private def this(alias : String, aliased : Table[FolderAssociationRecord]) = {
		this(alias, aliased, null)
	}

	override def getReferences : List[ ForeignKey[FolderAssociationRecord, _] ] = {
		return Arrays.asList[ ForeignKey[FolderAssociationRecord, _] ](Keys.FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_FOLDER_ID_FKEY, Keys.FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_DOCUMENT_ID_FKEY)
	}

	override def as(alias : String) : FolderAssociation = {
		new FolderAssociation(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : FolderAssociation = {
		new FolderAssociation(name, null)
	}
}
