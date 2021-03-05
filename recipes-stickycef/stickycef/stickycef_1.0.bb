#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "A CEF client for displaying dynamic web-content on an eink display"
SECTION = "examples"
DEPENDS += "X11"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02a3deda4f40597776116c8d842e41d7"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
 
SRCREV = "c18167acb615cb576a2c495e23f74151b0e71c16"
SRC_URI = "git://github.com/LittleDeltaPlus/StickyCEF.git"

S = "${WORKDIR}/git"

inherit autotools pkgconfig cmake

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
#PARALLEL_MAKE = "" 

EXTRA_OECMAKE = ""
