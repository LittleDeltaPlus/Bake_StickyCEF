#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "A CEF client for displaying dynamic web-content on an eink display"
COLLECTIONS = "example"
DEPENDS += "\
    libx11 \
    libxcomposite \
    libxcursor \
    libxdamage \
    libxext \
    libxfixes \
    libxi \
    libxrandr \
    libxrender \
    libxscrnsaver \
    libxtst \
    glib-2.0 \
    nss \
    nspr \
    atk \
    expat \
    libdrm \
    libxkbcommon \
    dbus \
    alsa-lib \
    cups \
    at-spi2-atk \
    mesa \
"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02a3deda4f40597776116c8d842e41d7"

LDFLAGS='-L=/usr/lib'

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
 
SRC_URI = "git://github.com/LittleDeltaPlus/StickyCEF.git;protocol=https;nobranch=1"
SRCREV = "230b07b708dd1db0ab9353e56a95dba674afae4a"

S = "${WORKDIR}/git"

inherit pkgconfig cmake
#inherit pkgconfig

EXTRA_OECMAKE = ""
