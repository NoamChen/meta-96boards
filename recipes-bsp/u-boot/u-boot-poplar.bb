require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

SUMMARY = "U-Boot bootloader for HiSilicon Poplar"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
# u-boot needs devtree compiler to parse dts files
DEPENDS += "dtc-native bc-native"
SRCREV = "64631e7e9ef879f99ff294d78bdc96f47663a296"
PV = "v2017.09+git${SRCPV}"

SRC_URI = "git://github.com/linaro/poplar-u-boot;protocol=git;branch=latest"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

UBOOT_EXTLINUX ??= "1"
UBOOT_EXTLINUX_LABELS ??= "default"
UBOOT_EXTLINUX_KERNEL_IMAGE_default ??= "../Image"
UBOOT_EXTLINUX_MENU_DESCRIPTION_default ??= "Linux Default"
UBOOT_EXTLINUX_FDTDIR ??= "../"
UBOOT_EXTLINUX_KERNEL_ARGS ??= "append mem=1G earlycon console=ttyAMA0"
UBOOT_EXTLINUX_ROOT ??= "root=/dev/mmcblk0p3 rootfstype=ext4 rootwait rw"
