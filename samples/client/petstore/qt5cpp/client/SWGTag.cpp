/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


#include "SWGTag.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGTag::SWGTag(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTag::SWGTag() {
    init();
}

SWGTag::~SWGTag() {
    this->cleanup();
}

void
SWGTag::init() {
    id = 0L;
    name = new QString("");
}

void
SWGTag::cleanup() {
    

    if(name != nullptr) {
        delete name;
    }
}

SWGTag*
SWGTag::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTag::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&id, pJson["id"], "qint64", "");
    ::Swagger::setValue(&name, pJson["name"], "QString", "QString");
}

QString
SWGTag::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTag::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("id", QJsonValue(id));

    toJsonValue(QString("name"), name, obj, QString("QString"));

    return obj;
}

qint64
SWGTag::getId() {
    return id;
}
void
SWGTag::setId(qint64 id) {
    this->id = id;
}

QString*
SWGTag::getName() {
    return name;
}
void
SWGTag::setName(QString* name) {
    this->name = name;
}


}

